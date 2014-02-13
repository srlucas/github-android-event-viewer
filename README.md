github-andriod-event-viewer
===========================

Github event viewer android app!

# Overview
This app is built to showcase how to connect to a REST api endpoint (such as github), populate a nice List and then populate a ListView with the fetched information


I've used the following libraries to ease development:

* [Android Async HTTP](https://github.com/loopj/android-async-http) for doing asynchronous HTTP requests with JSON parsing

# How it works
The application is very simple and straightforward. On launch it will:

* Connect to http://developer.github.com/v3/activity/events/
* Parses the returned JSON and extracts some information to show
* Populates a ListView and shows the information to the user
