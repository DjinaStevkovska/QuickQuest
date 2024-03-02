$(document).ready(function() {
    $.get('/menu', function(data) {
        $('header').append(data);
    }).fail(function() {
        console.error('Failed to load menu.');
    });
});
