import React, { Component } from 'react';

class Getuser extends Component {
  constructor(props) {
    super(props);
    this.state = {
      user: null
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch('https://api.randomuser.me/');
      const data = await response.json();
      this.setState({ user: data.results[0] });
    } catch (error) {
      console.error('Error fetching user:', error);
    }
  }

  render() {
    const { user } = this.state;

    return (
      <div style={{ padding: '30px', textAlign: 'center' }}>
        <h2>👤 Random User Details</h2>
        {!user ? (
          <p>Loading user data...</p>
        ) : (
          <div style={{ border: '1px solid #ccc', padding: '20px', display: 'inline-block' }}>
            <img src={user.picture.large} alt="User" style={{ borderRadius: '50%' }} />
            <h3>{user.name.title} {user.name.first}</h3>
          </div>
        )}
      </div>
    );
  }
}

export default Getuser;
