import React from 'react';

const ListOfPlayers = () => {
  const players = [
    { name: "Rohit", score: 85 },
    { name: "Kohli", score: 40 },
    { name: "Gill", score: 95 },
    { name: "Iyer", score: 35 },
    { name: "Pant", score: 77 },
    { name: "Hardik", score: 69 },
    { name: "Jadeja", score: 50 },
    { name: "Bumrah", score: 28 },
    { name: "Shami", score: 74 },
    { name: "Ashwin", score: 36 },
    { name: "Kuldeep", score: 66 }
  ];

  
  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      {players.map((p, index) => (
        <p key={index}>{p.name} - {p.score}</p>
      ))}

      <h3>Players with score below 70</h3>
      {lowScorers.map((p, index) => (
        <p key={index}>{p.name} - {p.score}</p>
      ))}
    </div>
  );
};

export default ListOfPlayers;
