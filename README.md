# Marvel API [![Build Status](https://travis-ci.org/ArnaudPiroelle/marvel-api.png?branch=master)](https://travis-ci.org/ArnaudPiroelle/marvel-api)


## Introduction
Marvel Entertainment released early 2014 an API to access their encyclopedia superhero.
The Marvel Comics API Allows developers everywhere to access information about Marvel's vast library of comics from what's coming up, to 70 years ago.
All that you need to use this API is to create an account on the portal dedicated to developers, to create an account and get an api key. To do this, go to the following address: https://developer.marvel.com.
After your registration, get your public key and private key (keep the secret).

## API Usages

Start by initializing the API with your keys

```java
MarvelApiBuilder.initMarvelApiBuilder(YOUR_PUBLIC_APIKEY, YOUR_PRIVATE_APIKEY);
```

Retrieve the service you want to use
```java
CharactersService charactersService = MarvelApiBuilder.getService(CharactersService.class);
ComicsService comicsService = MarvelApiBuilder.getService(ComicsService.class);
CreatorsService creatorsService = MarvelApiBuilder.getService(CreatorsService.class);
EventsService eventsService = MarvelApiBuilder.getService(EventsService.class);
SeriesService seriesService = MarvelApiBuilder.getService(SeriesService.class);
StoriesService storiesService = MarvelApiBuilder.getService(StoriesService.class);
```

Each service offers all the methods available through the API

## Download

### Maven
```xml
<dependency>
    <groupId>com.arnaudpiroelle</groupId>
    <artifactId>marvel-api</artifactId>
    <version>(insert latest version)</version>
</dependency>
```

### Gradle
```
dependencies {
  compile 'com.arnaudpiroelle:marvel-api:(insert latest version)'
}
```

## License
```
Copyright 2014 Arnaud Piroelle.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```