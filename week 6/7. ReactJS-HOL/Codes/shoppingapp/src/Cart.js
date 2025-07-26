import React, { Component } from 'react';

class Cart extends Component {
  render() {
    return (
      <div style={{
        border: '1px solid #ccc',
        borderRadius: '10px',
        padding: '10px',
        margin: '10px',
        width: '250px',
        textAlign: 'left'
      }}>
        <h3>{this.props.itemname}</h3>
        <p><strong>Price:</strong> ₹{this.props.price}</p>
      </div>
    );
  }
}


Cart.defaultProps = {
  itemname: "Unknown Item",
  price: "0.00"
};

export default Cart;
