import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { AuthGuard } from './shared';

import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { TranslateModule, TranslateLoader } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';

import { PageNotFoundComponent } from './components/not-found/not-found.component';
import { GifcardDetailComponent } from './components/item-detail/giftcard-detail.component';
import { PrincipalComponent } from './components/layout/principal.component';
import { CarouselComponent } from './components/carousel/carousel.component';
import { CardsComponent } from './components/cards-list/cards.component';

// AoT requires an exported function for factories
export function createTranslateLoader(http: HttpClient) {
    // 
    return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}

const routes: Routes = [
	  { path: '', component: PrincipalComponent },
      { path: 'gifcardDetail/:id', component: GifcardDetailComponent },
	  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
	declarations: [
        PageNotFoundComponent, 
        GifcardDetailComponent,
        PrincipalComponent,
        CarouselComponent,
        CardsComponent
    ],
    imports: [
    	CommonModule,
    	RouterModule.forRoot(routes, { enableTracing: true }),
    	NgbModule.forRoot(),
    	HttpClientModule,
	    TranslateModule.forRoot({
	        loader: {
	            provide: TranslateLoader,
	            useFactory: createTranslateLoader,
	            deps: [HttpClient]
	        }
	    })
    ],
    exports: [RouterModule]
})
export class AppRoutingModule {}
