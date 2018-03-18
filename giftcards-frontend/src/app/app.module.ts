import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { TranslateModule, TranslateLoader } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NgbDropdownModule } from '@ng-bootstrap/ng-bootstrap';
import { TooltipModule } from 'ngx-bootstrap/tooltip';
import { ModalModule } from 'ngx-bootstrap/modal';

// components
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { HeaderComponent } from './components/nav-bar/nav-bar.component';
import { FooterComponent } from './components/footer/footer.component';
import { CarouselComponent } from './components/carousel/carousel.component';
import { CardsComponent } from './components/cards-list/cards.component';
import { PageNotFoundComponent } from './components/not-found/not-found.component';
import { GifcardDetailComponent } from './components/item-detail/giftcard-detail.component';
import { PrincipalComponent } from './components/layout/principal.component';

// services
import { AuthGuard } from './shared';
import { GiftCardService } from './services/giftcard.service';

// AoT requires an exported function for factories
export function createTranslateLoader(http: HttpClient) {
    // 
    return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    CarouselComponent,
    CardsComponent,
    PageNotFoundComponent,
    GifcardDetailComponent,
    PrincipalComponent
  ],
  imports: [
    CommonModule,
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    TranslateModule.forRoot({
        loader: {
            provide: TranslateLoader,
            useFactory: createTranslateLoader,
            deps: [HttpClient]
        }
    }),
    AppRoutingModule,
    NgbDropdownModule.forRoot(),
    NgbModule.forRoot(),
    TooltipModule.forRoot(),
    ModalModule.forRoot()
  ],
  providers: [
    AuthGuard, 
    GiftCardService
  ],
  bootstrap: [
  	AppComponent
  ]
})
export class AppModule { }
