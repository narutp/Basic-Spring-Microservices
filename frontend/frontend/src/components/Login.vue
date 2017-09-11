<template>
  <div class="login--container">
    <div class="hero is-primary">
      <div class="hero-body">
        <p class="title">
          Spring Framework practice
        </p>
        <p class="subtitle">
          Everything you need to <strong>create a website</strong> with Vue, Bulma and MongoDb 2017/09/03
        </p>
      </div>
    </div>
    <div class="login--body">
      <div class="columns">
        <div class="column login--login-box">
          <div class="field">
            <p class="control has-icons-left has-icons-right">
              <input class="input" type="" placeholder="Username">
              <span class="icon is-small is-left">
                <i class="fa fa-envelope"></i>
              </span>
            </p>
          </div>
          <div class="field">
            <p class="control has-icons-left">
              <input class="input" type="password" placeholder="Password">
              <span class="icon is-small is-left">
                <i class="fa fa-lock"></i>
              </span>
            </p>
          </div>
          <div align="right">
            <button class="button is-success">
              Login
            </button>
            <button class="button is-info" @click="register()">
              Register
            </button>
          </div>
        </div>
        <div class="column">
          <img src="https://image.freepik.com/free-icon/male-user-shadow_318-34042.jpg" width="200px;">
        </div>
      </div>
    </div>
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
  },
  methods: {
    register () {
      this.$router.replace({ path: '/register' })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.login--login-box {
  border: 1px solid #c2cbd1;
  padding: 15px 15px 15px 15px;
}

.login--body {
  margin: 30px;
}
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
