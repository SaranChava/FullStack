import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-customer',
  standalone: true,
  imports: [],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent {

  customers: any[] = [];

  constructor(private http: HttpClient) {}

  ngOnInit(){
    this.getCustomers();
  }

  getCustomers() {
    const apiUrl = 'http://localhost:8080/customer/2';
    this.http.get<any[]>(apiUrl).subscribe({
      next: (response) => {
        this.customers = response;
      },
      error: (error) => {
        console.error('Error fetching customers:', error);
      }
    });
  }

}
