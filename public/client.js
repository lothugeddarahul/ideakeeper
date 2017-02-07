$(document).ready(function(){
  getIdeas();
});

function getIdeas(){
  $.get('/ideas', function(data){
    console.log(data);
    renderData(data);
  });
}

function renderData(data){
  for (var i = 0; i < data.length; i++) {
<<<<<<< HEAD
    $('ul').append('<li id="list">' + data[i].idea + '</li>');
=======
    $('ul').append('<li>' + data[i].idea + '</li>');
>>>>>>> 8da7fc3c896b13ad7958cfac76321247ca2bcb24
  }
}   