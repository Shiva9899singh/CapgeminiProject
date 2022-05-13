import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DealerServiceService } from 'src/app/services/dealer-service.service';
import { Dealer } from '../../cls/dealer';
@Component({
  selector: 'app-add-dealer',
  templateUrl: './add-dealer.component.html',
  styleUrls: ['./add-dealer.component.css']
})
export class AddDealerComponent implements OnInit {

  dealer: Dealer= new Dealer();
  constructor(private dealerservice: DealerServiceService, 
    private router: Router)
    {}

  ngOnInit(): void {
  }
  saveDealer(){
    this.dealerservice.createCrops(this.dealer).subscribe( data =>{
      console.log(data);
      this.goToDealer();
    },
    error => console.log(error));
  }

  goToDealer(){
    this.router.navigate(['/avail-crop']);
  }
  
  onSubmit(){
    console.log(this.dealer);
    this.saveDealer();
    this.router.navigate(['/avail-crop']);
  }
}


