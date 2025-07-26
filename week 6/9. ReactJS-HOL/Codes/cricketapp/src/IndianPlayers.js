import React from 'react';

const IndianPlayers = () => {
  const oddTeam = ["Rohit", "Gill", "Pant", "Jadeja", "Shami"];
  const evenTeam = ["Kohli", "Iyer", "Hardik", "Bumrah", "Ashwin", "Kuldeep"];

  
  const [captain, viceCaptain, ...others] = oddTeam;

  
  const T20 = ["Surya", "Tilak"];
  const Ranji = ["Rahane", "Shaw"];
  const mergedPlayers = [...T20, ...Ranji];

  return (
    <div>
      <h2>Indian Team Lineup</h2>
      <p><strong>Captain:</strong> {captain}</p>
      <p><strong>Vice Captain:</strong> {viceCaptain}</p>
      <p><strong>Others:</strong> {others.join(", ")}</p>

      <h3>Even Team:</h3>
      <p>{evenTeam.join(", ")}</p>

      <h3>Merged Players (T20 + Ranji):</h3>
      <p>{mergedPlayers.join(", ")}</p>
    </div>
  );
};

export default IndianPlayers;
