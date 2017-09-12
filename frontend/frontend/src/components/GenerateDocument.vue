<template lang="html">
  <div class="generate-document--container">
    <div class="hero is-warning">
      <div class="hero-body">
        <p class="title">
          Generate Document
        </p>
        <p class="subtitle">
          Including title, writer, content and password.
        </p>
      </div>
    </div>
    <section class="generate-document--body">
      <div class="columns">
        <div class="column" align="left">
          <b-field label="Title">
              <b-input v-model="title"></b-input>
          </b-field>

          <b-field label="Writer">
              <b-input v-model="writer"></b-input>
          </b-field>

          <b-field label="Content">
              <b-input v-model="content" type="text"></b-input>
          </b-field>

          <b-field label="Password">
              <b-input v-model="password" type="text"></b-input>
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
          <!-- <p style="font-size: 60px;">Document</p> -->
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
