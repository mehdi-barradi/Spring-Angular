import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable({providedIn:"root"})
export class ProductService{

  constructor(private http : HttpClient) {
  }

  getProduct(){
    return this.http.get("http://localhost:8080/products")
  }

  createProduct(product : any){
    return this.http.post("http://localhost:8080/products",product)
  }

}
