import { Component } from '@angular/core';
//import { Account } from '../../types/Account';
import { Customer } from '../../types/customer';


@Component({
  selector: 'app-customersample',
  standalone: true,
  imports: [],
  templateUrl: './customersample.component.html',
  styleUrls: ['./customersample.component.css']
})
export class CustomersampleComponent {
  // account:Cu = new Account("1",400,"1");
  // name: string, email: string, username: string, password: string, role: string, customerId?:string)
   customer:Customer = new Customer("jhon","jhon@gmail.com","jhonuser","User","1");
}
