import { GiftCardService } from '../../services/giftcard.service';
import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';

import 'rxjs/add/operator/switchMap';

@Component({
  selector: 'giftcard-detail',
  templateUrl: './giftcard-detail.component.html',
  styleUrls: ['./giftcard-detail.component.scss']
})
export class GifcardDetailComponent implements OnInit {
	public giftcard;
	public id: string;

	constructor(private route: ActivatedRoute,
  			      private router: Router,
              private giftcardService: GiftCardService) {

	}

	ngOnInit() {
		this.id = this.route.snapshot.paramMap.get('id');

    this.giftcardService.getGiftCardById(this.id)
      .subscribe(giftcard => this.giftcard = giftcard);;

//	    console.log("hola" + JSON.stringify(this.id));
//
//	    // llamar al service para cargar el objeto giftcard
//	    this.giftcard = {
//			id: this.id,
//			nombre: 'name',
//			titulo: 'title',
//			descripcion: 'desc',
//			urlImageMedium: 'assets/images/gift-card.jpg',
//			details: [
//				'Valida para blablabl',
//				'Duracion x meses desde la fecha de compra',
//				'No canjeable por dinero',
//				'xxxx uuu'
//			]
//		};
	}
}
