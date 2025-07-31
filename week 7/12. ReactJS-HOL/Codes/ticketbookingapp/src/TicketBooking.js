import React, { Component } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

class TicketBooking extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false
    };
  }

  handleLogin = () => {
    this.setState({ isLoggedIn: true });
  }

  handleLogout = () => {
    this.setState({ isLoggedIn: false });
  }

  render() {
    let content;

    if (this.state.isLoggedIn) {
      content = <UserPage />;
    } else {
      content = <GuestPage />;
    }

    return (
      <div style={{ padding: '20px' }}>
        <h1>✈️ Flight Booking Portal</h1>

        <div style={{ marginBottom: '20px' }}>
          {this.state.isLoggedIn ? (
            <button onClick={this.handleLogout}>Logout</button>
          ) : (
            <button onClick={this.handleLogin}>Login</button>
          )}
        </div>

        {/* Conditional page render */}
        {content}
      </div>
    );
  }
}

export default TicketBooking;
