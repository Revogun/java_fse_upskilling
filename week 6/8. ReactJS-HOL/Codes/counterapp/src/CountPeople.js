import React, { Component } from 'react';

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0
    };
  }

  updateEntry = () => {
    this.setState(prevState => ({
      entryCount: prevState.entryCount + 1
    }));
  }

  updateExit = () => {
    this.setState(prevState => ({
      exitCount: prevState.exitCount + 1
    }));
  }

  render() {
    return (
      <div style={{
        textAlign: 'center',
        marginTop: '50px',
        fontFamily: 'Arial'
      }}>
        <h2>Mall People Counter</h2>
        <p><strong>People Entered:</strong> {this.state.entryCount}</p>
        <p><strong>People Exited:</strong> {this.state.exitCount}</p>
        
        <button 
          onClick={this.updateEntry}
          style={{ marginRight: '10px', padding: '10px 20px' }}
        >
          Login
        </button>
        
        <button 
          onClick={this.updateExit}
          style={{ padding: '10px 20px' }}
        >
          Exit
        </button>
      </div>
    );
  }
}

export default CountPeople;
