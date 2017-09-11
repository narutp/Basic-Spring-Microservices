<template>
  <div class="login--container">
    <section class="hero is-primary">
      <div class="hero-body">
        <p class="title">
          Spring Framework practice
        </p>
        <p class="subtitle">
          Everything you need to <strong>create a website</strong> with Vue, Bulma and MongoDb 2017/09/03
        </p>
      </div>

      <div class="row">
        <div class="col-6">
          <form id="form--form-container">
            <div class="form--group">
              <label>Username</label>
              <input class="form-control" id="form--username" placeholder="Please type your username">
            </div>
            <div class="form--group">
              <label>Password</label>
              <input type="password" class="form-control" id="form--password" placeholder="Please type your password">
            </div>
            <!-- <input type="button" class="btn btn-primary" id="form--loginBtn" value="Login" onclick="login()"> -->
            <div align="right">
              <a id="form--loginBtn" class="button is-primary is-outlined" onclick="login()">Login</a>
              <a id="form--registBtn" class="button is-warning is-outlined" onclick="registerClicked()">Register</a>
            </div>
            <!-- <input type="button" class="btn btn-info" id="form--registBtn" value="Register" onclick="registerClicked()"> -->
          </form>
          <div class="notification is-danger" role="alert" id="form--alert-message" style="display:none;">
            <p id="result"></p>Here is <a href="register.html" class="alert-link">register link</a>.
          </div>
        </div>
        <div class="col-6">
          <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img class="d-block w-100" src="http://izoomrud.com/wp-content/uploads/2016/09/14-8.jpg" alt="First slide" style="max-height: 300px;">
              </div>
              <div class="carousel-item">
                <img class="d-block w-100" src="https://images7.alphacoders.com/438/438941.jpg" alt="Second slide" style="max-height: 300px;">
              </div>
              <div class="carousel-item">
                <img class="d-block w-100" src="http://3.bp.blogspot.com/-kexo-08KWYE/TVkBKQ3ONyI/AAAAAAAAIqg/JJIz-rAO2YA/s1600/Landscapes_30.jpg" alt="Third slide" style="max-height: 300px;">
              </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
          </div>
        </div>
      </div>
    </section>
  </div>
</template>

<script>
export default {
  name: 'hello',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  components: {
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
