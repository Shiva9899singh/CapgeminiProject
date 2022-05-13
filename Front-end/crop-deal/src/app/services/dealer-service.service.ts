import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Dealer } from '../components/cls/dealer';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class DealerServiceService {

  private baseURL1= "http://localhost:9002/adddealer";
  constructor( private httpClient: HttpClient) { }
  createCrops(dealer: Dealer): Observable<object>{
    return this.httpClient.post(`${this.baseURL1}`, dealer);
  }

 
}
