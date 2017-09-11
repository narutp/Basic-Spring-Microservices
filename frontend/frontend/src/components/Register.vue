<template lang="html">
  <div class="register--container">
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
          <div class="field">
            <p class="control">
              <button class="button is-success">
                Login
              </button>
            </p>
          </div>
        </div>
        <div class="column">
          Test
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
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
