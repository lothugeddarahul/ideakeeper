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

    $('ul').append('<li id="list">' + data[i].idea + '</li>');
  }
}   