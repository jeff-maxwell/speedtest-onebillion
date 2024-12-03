## Java

**Java Developer Kit (JDK):** 23.0.1+11-39

# Loop One Billion Times no Output

| Command         | Time (sec) | User (sec) | CPU   |
|-----------------|------------|------------|-------|
| Compile & Run   |            |            |       |
| time java Main  | 0.41       | 0.05       | 0.401 |
|                 |            |            |       |
| Compile         |            |            |       |
| javac Main.java | 0.43       | 0.05       | 0.384 |
|                 |            |            |       |
| Run             |            |            |       |
| time java Main  | 0.04       | 0.03       | 0.123 |

# Loop One Million Times with Output

| Command               | Time (sec) | User (sec) | CPU   |
|-----------------------|------------|------------|-------|
| Compile & Run         |            |            |       |
| time java MainOutput  | 0.97       | 0.56       | 1.931 |
|                       |            |            |       |
| Compile               |            |            |       |
| javac MainOutput.java | 0.41       | 0.04       | 0.303 |
|                       |            |            |       |
| Run                   |            |            |       |
| time java MainOutput  | 0.55       | 0.38       | 1.200 |