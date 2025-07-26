import React from 'react';
import './App.css';
import ListOfPlayers from './ListOfPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
  const flag = true; 

  return (
    <div className="App" style={{ padding: '20px' }}>
      <h1> Cricket App </h1>
      {flag ? <ListOfPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
