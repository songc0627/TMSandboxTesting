# TMSandboxTesting



1. I’m using Java (with junit) here although I may also rewrite in .net, but i think Java is more common and easy to setup dev environment. (I’m using Eclipse).
2. Although the sample API call is using fixed CategoryId, I’m making it as variable so we can add more test data later. We can add parameter to test method, or make different IDs as a test CSV file, and run the test repeatedly.
3. For JSON parser, having a reader is much easier way and easy to do refactor and no need to change on the test method.
4. This is very basic framework, and I should do better on logging and exception.

Assumption:
1. The acceptance criteria is to satisfy all 3 conditions, and if we need more detail failure message we can separate into 3 tests.
2. Based on current API, I see no appid/token or authorization/authentication needed. Can be adjusted if needed.
