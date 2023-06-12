import {Component, OnInit} from '@angular/core';
import {ProductService} from "../../service/product.service";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit{

  constructor(private productService : ProductService) {
  }

  ngOnInit() {
    this.productService.getProduct().subscribe((res:any)=>{
      console.log(res._embedded.products)
    })
  }

}
