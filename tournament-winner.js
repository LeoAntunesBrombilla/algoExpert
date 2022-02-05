// time complexity = O(n)
// space complexity = O(t) => t is the number of teams 

function tournamentWinner(competitions, results) {
  let winner = "";
  let totalScore = { [winner]: 0 };

  for (let index = 0; index < competitions.length; index++) {
    const result = results[index];
    const [homeTeam, awayTeam] = competitions[index];

    const winningTeamOfTheRound = result === 0 ? awayTeam : homeTeam;

    updateScore(winningTeamOfTheRound, 3, totalScore);

    if (totalScore[winningTeamOfTheRound] > totalScore[winner]) {
      winner = winningTeamOfTheRound;
    }
  }

  return winner;
}

function updateScore(team, points, scores) {
  if (!scores.hasOwnProperty(team)) scores[team] = 0;

  scores[team] += points;
}

console.log(
  tournamentWinner(
    [
      ["HTML", "C#"],
      ["C#", "Python"],
      ["Python", "HTML"],
    ],
    [0, 0, 1]
  )
);
