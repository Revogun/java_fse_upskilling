import React, { Component } from 'react';

class EventExamples extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
      message: '',
      rupees: '',
      euro: ''
    };
  }

  
  increment = () => {
    this.setState(prev => ({ count: prev.count + 1 }));
  };

  
  sayHello = () => {
    this.setState({ message: 'Hello! You clicked Increase.' });
  };

  
  handleIncrease = () => {
    this.increment();
    this.sayHello();
  };

 
  handleDecrease = () => {
    this.setState(prev => ({ count: prev.count - 1 }));
  };

  
  sayWelcome = (msg) => {
    this.setState({ message: msg });
  };

  
  handlePress = (e) => {
    e.preventDefault(); 
    this.setState({ message: 'I was clicked!' });
  };

  
  handleCurrencyChange = (e) => {
    this.setState({ rupees: e.target.value });
  };

  handleSubmit = () => {
    const euroValue = parseFloat(this.state.rupees) / 90; 
    this.setState({ euro: euroValue.toFixed(2) });
  };

  render() {
    return (
      <div style={{ padding: '30px', fontFamily: 'Arial' }}>
        <h2>Event Examples App</h2>

        {/* Counter */}
        <h3>Counter: {this.state.count}</h3>
        <button onClick={this.handleIncrease}>Increase</button>
        <button onClick={this.handleDecrease} style={{ marginLeft: '10px' }}>Decrease</button>

        <br /><br />

        {/* Welcome Message */}
        <button onClick={() => this.sayWelcome("Welcome to React Events!")}>Say Welcome</button>

        <br /><br />

        {/* Synthetic Event */}
        <button onClick={this.handlePress}>OnPress</button>

        <br /><br />
        <p><strong>Message:</strong> {this.state.message}</p>

        <hr />

        {/* Currency Converter */}
        <h3>Currency Converter</h3>
        <input
          type="text"
          placeholder="Enter ₹ amount"
          value={this.state.rupees}
          onChange={this.handleCurrencyChange}
        />
        <button onClick={this.handleSubmit} style={{ marginLeft: '10px' }}>
          Convert to Euro
        </button>

        {this.state.euro && (
          <p>💶 Euro: €{this.state.euro}</p>
        )}
      </div>
    );
  }
}

export default EventExamples;
