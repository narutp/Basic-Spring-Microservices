<template>
  <div id="app">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <navbar></navbar>
    <router-view></router-view>
    <footerbar></footerbar>
  </div>
</template>

<script>
import Navbar from '@/components/Navbar.vue'
import Footerbar from '@/components/Footer.vue'
export default {
  name: 'app',
  components: {
    Navbar,
    Footerbar
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
