
import { Component } from '@angular/core';
import { Account } from '../../types/account';

@Component({
  selector: 'app-accountsample',
  standalone: true,
  imports: [],
  templateUrl: './accountsample.component.html',
  styleUrls: ['./accountsample.component.css']
})
export class AccountsampleComponent {
   account:Account=new Account("1",500.00,"1");
}
