// import { Component } from '@angular/core';
// //import { Account } from '../../types/Account';
// import { Customer } from '../../types/customer';


// @Component({
//   selector: 'app-customersample',
//   standalone: true,
//   imports: [],
//   templateUrl: './customersample.component.html',
//   styleUrls: ['./customersample.component.css']
// })
// export class CustomersampleComponent {
//   // account:Cu = new Account("1",400,"1");
//   // name: string, email: string, username: string, password: string, role: string, customerId?:string)
//    customer:Customer = new Customer("jhon","jhon@gmail.com","jhonuser","User","1");
// }


import { Component, OnInit } from '@angular/core';
import { Customer } from '../../types/customer';
import { FormBuilder, FormGroup, FormsModule, Validators } from '@angular/forms';
import { of } from 'rxjs';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css'],
})
export class CustomerComponent implements OnInit {
  isFormSubmitted: boolean | undefined;
  customerSuccess$: any;
  customerError$: any;
onSubmit() {
  this.isFormSubmitted = true;
    this.customerSuccess$ = of('');
    this.customerError$ = of('');
throw new Error('Method not implemented.');
}
   customerForm!: FormGroup;

   customer: Customer = 
    new Customer("John Doe", "john@example.com", "john_doe", "password123", "User", "1");
    // new Customer(2, "Hardcoded Customer 2", "hardcoded2@example.com", "hardcoded_user2", "password123", null)
  

  constructor( private formBuilder: FormBuilder) {
   

  }

  ngOnInit():void {
    // this.loadCustomers();
    this.customerForm = this.formBuilder.group({
      name: ["", [Validators.required]],
      email: ["", [Validators.required]],
      username: ["", [Validators.required]],
      password: ["", [Validators.required]],
    });
  }

  
  
}
