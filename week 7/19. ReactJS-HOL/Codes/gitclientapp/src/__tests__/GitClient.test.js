import axios from 'axios';
import GitClient from '../GitClient';

// 👇 Mock axios
jest.mock('axios');

describe('Git Client Tests', () => {
  test('should return repository names for techiesyed', async () => {
    const mockedRepos = [
      { name: 'repo1' },
      { name: 'repo2' },
      { name: 'repo3' }
    ];

    // 👇 Mock axios.get to return mockedRepos
    axios.get.mockResolvedValue({ data: mockedRepos });

    const client = new GitClient();
    const result = await client.getRepositories('techiesyed');

    expect(result).toEqual(['repo1', 'repo2', 'repo3']);
    expect(axios.get).toHaveBeenCalledWith('https://api.github.com/users/techiesyed/repos');
  });
});
