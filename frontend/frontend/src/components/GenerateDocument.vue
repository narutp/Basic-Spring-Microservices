<template lang="html">
  <div class="generate-document--container">
    <hr>
    <section class="generate-document--body">
      <div class="columns">
        <div class="column" align="left">
          <b-field label="Title">
              <b-input></b-input>
          </b-field>

          <b-field label="Writer">
              <b-input></b-input>
          </b-field>

          <b-field label="Content">
              <b-input type="text"></b-input>
          </b-field>

          <b-field label="Password">
              <b-input type="text"></b-input>
          </b-field>

          <div class="generate-document--button" align="right">
            <button class="button is-primary" @click="submitDocument()">
              Submit
            </button>

            <button class="button is-danger" @click="back()">
              Back
            </button>
          </div>
        </div>
        <div class="column">
          <p style="font-size: 60px;">Document</p>
        </div>
      </div>
    </section>
  </div>
</template>

<script>
import Axios from 'axios'
export default {
  data () {
    return {
      title: '',
      writer: '',
      content: '',
      password: ''
    }
  },
  methods: {
    submitDocument () {
      let self = this
      Axios.get(`http://localhost:8090/create/${this.title}/${this.writer}/${this.content}/${this.password}`).then(function (response) {
        self.$router.replace({ path: '/document' })
      }).catch(function (error) {
        console.log(error)
      })
    },
    back () {
      this.$router.replace({ path: '/document' })
    }
  }
}
</script>

<style scoped>
.generate-document--body {
  margin: 30px;
}
</style>
