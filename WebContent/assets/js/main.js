//----- Angular js

var app = angular.module("docHeal", ['ui.router','ui.bootstrap']);

//app.config(['$stateProvider', '$locationProvider','urlRouterProvider',funtion{}]);
app.config(function($stateProvider, $locationProvider,  
    $urlRouterProvider) { 

        console.log(">>>>>>>>>>>>>>>>> check 1234  ");
$stateProvider.state('main', {
        url: '/main',
        templateUrl: "assets/html/main.html",
        controller: "mainCtrl"
    }).state('login',{
        url: '/login',
        templateUrl: "assets/html/loginModal.html",
        controller: "loginModalCtrl"
    });
 
    $urlRouterProvider.otherwise("/main"); 
}); 


//----- JavaScript
$(document).ready(function () {
    // Owl-carousel

    $('.site-main .about-area .owl-carousel').owlCarousel({
        loop: true,
        autoplay: true,
        dots: true,
        responsive: {
            0: {
                items: 1
            },
            560: {
                items: 2
            }
        }
    })

    // sticky navigation menu

    let nav_offset_top = $('.header_area').height() + 50;

    function navbarFixed() {
        if ($('.header_area').length) {
            $(window).scroll(function () {
                let scroll = $(window).scrollTop();
                if (scroll >= nav_offset_top) {
                    $('.header_area .main-menu').addClass('navbar_fixed');
                } else {
                    $('.header_area .main-menu').removeClass('navbar_fixed');
                }
            })
        }
    }

    navbarFixed();

});
