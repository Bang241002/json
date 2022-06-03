'use strict';

var weatherApp = angular.module('weatherApp', []);

weatherApp.controller('WeatherCtrl', function ($scope, $http){
    $http.get("https://api.openweathermap.org/data/2.5/weather?q=Hanoi&appid=fcc8bbdc471c21894eedd26839e3fac3&units=metric")

    .success(function (data){
        if(data){

            $scope.current = data.main.temp;
            $scope.temp_min = data.main.temp_min;
            $scope.temp_max = data.main.temp_max;
            $scope.wind_speed = data.wind.speed;
            $scope.img_url = 'http://openweathermap.org/img/wn/'+ data.weather[0].icon +'@2x.png';
        }
    })
    .error(function (data, status){
        console.log(data);
    })

});

weatherApp.controller('WeatherCtol', function ($scope, $http){
    $http.get("https://api.openweathermap.org/data/2.5/weather?q=hochiminh&appid=bd8c4107169abeea9b5e7d2ff8d08d2f&units=metric")

    .success(function (data){
        if(data){

            $scope.current = data.main.temp;
            $scope.temp_min = data.main.temp_min;
            $scope.temp_max = data.main.temp_max;
            $scope.wind_speed = data.wind.speed;
            $scope.img_url = 'http://openweathermap.org/img/wn/'+ data.weather[0].icon +'@2x.png';
        }
    })
    .error(function (data, status){
        console.log(data);
    })

});