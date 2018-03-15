import { Component, OnInit } from '@angular/core';
import { Router, NavigationEnd } from '@angular/router';
import { TranslateService } from '@ngx-translate/core';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html'
})
export class CardsComponent implements OnInit {

	public cards: Array<any> = [];
  
     constructor(private translate: TranslateService, public router: Router) {

        this.translate.addLangs(['en', 'es']);
        this.translate.setDefaultLang('en');
        const browserLang = this.translate.getBrowserLang();
        this.translate.use(browserLang.match(/en|es/) ? browserLang : 'en');
        
        this.cards.push(
            {
                id: 1,
                name: 'Giftcard 1',
                urlImageMedium: 'assets/images/gift-card.jpg',
                title: 'titulo',
                description: 'descripcion'
            },
            {
                id: 1,
                name: 'Giftcard 2',
                urlImageMedium: 'assets/images/giftcard.png',
                title: 'titulo',
                description: 'descripcion'
            },
            {
                id: 1,
                name: 'Giftcard 3',
                urlImageMedium: 'assets/images/giftcard2.jpg',
                title: 'titulo',
                description: 'descripcion'
            },
            {
                id: 1,
                name: 'Giftcard 4',
                urlImageMedium: 'assets/images/giftcard2.png',
                title: 'titulo',
                description: 'descripcion'
            }
            ,
            {
                id: 1,
                name: 'Giftcard 5',
                urlImageMedium: 'assets/images/giftcard3.png',
                title: 'titulo',
                description: 'descripcion'
            }
        );
    }

    ngOnInit() {}
}
