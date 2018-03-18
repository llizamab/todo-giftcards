import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
//import { of } from 'rxjs/observable/of';

//import { Giftcards } from '../mocks/giftcards.mock';

@Injectable()
export class GiftCardService {

  private giftcardsUrl = 'http://localhost:9001/giftcards';
  private findAll = this.giftcardsUrl + '/findAll';
  private findById = this.giftcardsUrl + '/findById?id=';
  
  constructor(private http: HttpClient) { 
  
  }

  getAllGiftCards(): Observable<any[]> {
    return this.http.get<any[]>(this.findAll);
  }
  
  getGiftCardById(id: string): Observable<any> {
    return this.http.get<any>(this.findById + id);
  }
}