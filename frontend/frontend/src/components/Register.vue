<template lang="html">
  <div class="register--container">
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
    <div class="register--body">
      <div class="columns">
        <div class="column register--register-box">
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
              Submit
            </button>
            <button class="button is-danger" @click="backLogin()">
              Back
            </button>
          </div>
        </div>
        <div class="column">
          <img src="https://www.flmontreal.com/wp-content/uploads/2014/09/Register-Icon.png" width="200px">
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    backLogin () {
      this.$router.replace({ path: '/' })
    }
  }
}
</script>

<style scoped>
.register--register-box {
  border: 1px solid #c2cbd1;
  padding: 15px 15px 15px 15px;
}

.register--body {
  margin: 30px;
}
</style>
