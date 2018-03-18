import { GiftCardService } from '../../services/giftcard.service';
import { Component, OnInit } from '@angular/core';
import { Router, NavigationEnd } from '@angular/router';
import { TranslateService } from '@ngx-translate/core';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html'
})
export class CardsComponent implements OnInit {

	   public cards: Array<any> = [];
  
     constructor(private translate: TranslateService, 
                 public router: Router, 
                 private giftcardService: GiftCardService) {

        this.translate.addLangs(['en', 'es']);
        this.translate.setDefaultLang('en');
        const browserLang = this.translate.getBrowserLang();
        this.translate.use(browserLang.match(/en|es/) ? browserLang : 'en');

    }

    ngOnInit() {
      this.getAllGiftCards();
    }
  
    getAllGiftCards(): void {
      
      this.giftcardService.getAllGiftCards()
            .subscribe(giftcards => this.cards = giftcards);
    }
}
