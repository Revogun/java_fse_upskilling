import React, { Component } from 'react';
import Cart from './Cart';

class OnlineShopping extends Component {
  constructor(props) {
    super(props);
    this.state = {
      items: [
        { itemname: "Laptop", price: 60000 },
        { itemname: "Mobile", price: 20000 },
        { itemname: "Smart Watch", price: 5000 },
        { itemname: "Headphones", price: 2500 },
        { itemname: "Backpack", price: 1500 }
      ]
    };
  }

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <h2>Online Shopping Cart</h2>
        <div style={{ display: 'flex', flexWrap: 'wrap' }}>
          {this.state.items.map((item, index) => (
            <Cart key={index} itemname={item.itemname} price={item.price} />
          ))}
        </div>
      </div>
    );
  }
}

export default OnlineShopping;
