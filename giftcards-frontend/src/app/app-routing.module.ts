import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { PageNotFoundComponent } from './components/not-found/not-found.component';
import { GifcardDetailComponent } from './components/item-detail/giftcard-detail.component';
import { PrincipalComponent } from './components/layout/principal.component';

const routes: Routes = [
	  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
    { path: 'dashboard', component: PrincipalComponent },
    { path: 'gifcardDetail/:id', component: GifcardDetailComponent },
	  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
    imports: [RouterModule.forRoot(routes) ],
    exports: [RouterModule]
})
export class AppRoutingModule {}
