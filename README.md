# automation-appium


automation-appium is an implementation of Selenium Grid and Appium for run a page object model test framework base on TesnNg for showing benefits of parallel execution.

## Original Exercise

The original scope of the exercise completes the following tutorial:[https://www.guru99.com/introduction-to-appium.html#5](https://www.guru99.com/introduction-to-appium.html#5), this can be found on the folder **original_exercise**.

## Implemented Improvements


The **improved_version** was made with the foundation of the previous one and has the following upgrades: 

- Use of Maven for manage build of the code
- Implement the Page Object Model pattern
- Parallel execution on a real and emulated device
- Use AppiumFieldDecorator for allowing the testing in native and hybrid applications
- Also allows the execution (if required ) of browsers 

## Future Improvements

- Reporting using the Extended Report library (parallel)
- Include the project on a docker instance
- Allow the integration with a cloud base system like Browserstack for run the same test
- Manage its lifecycle with a CI tool
 

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update the tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
