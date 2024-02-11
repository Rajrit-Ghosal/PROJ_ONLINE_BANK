import { Component } from '@angular/core';
import { Customer } from '../../types/customer';

@Component({
  selector: 'app-customerarray',

  templateUrl: './customerarray.component.html',
  styleUrls: ['./customerarray.component.css']
})
export class CustomerarrayComponent {
  customers: Customer[] = [
    new Customer("John Doe", "john@example.com", "john_doe", "password123", "User", "1"),
    new Customer("John Doe1", "john1@example.com", "john_doe", "password123", "Admin", "2")
   ]
}
