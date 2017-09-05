function login () {
  $("#form--loginBtn").click(function() {
    var name = $("#form--username").val()
    var password = $("#form--password").val()
    $.get( `http://localhost:8080/login/${name}/${password}`, function( data ) {
      console.log(data)
      if (data == 'false') {
        $("#result").html("Login failed, Your username or password is incorrect!")
        document.getElementById("form--alert-message").style.display = "";
      } else {
        window.location = "success.html"
      }
    });
  });
}

function register () {
  $("#register--registerBtn").click(function() {
    var name = $("#register--username").val()
    var password = $("#register--password").val()
    // send data back to know that it was completely set name and password.
    $.get( `http://localhost:8080/register/${name}/${password}`, function( data ) {
      // if (data == 'false') {
      //   $("#result").html("Login failed, Your username or password is incorrect!")
      //   document.getElementById("form--alert-message").style.display = "";
      // } else {
      //   window.location = "success.html"
      // }
      window.location = "index.html"
    });
  });
}
