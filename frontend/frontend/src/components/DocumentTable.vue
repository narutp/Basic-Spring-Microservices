<template lang="html">
  <div document-table--container>
    <hr>
    <!-- <table class="table is-striped is-fullwidth" style="margin: 30px">
      <thead>
        <tr>
          <th>No</th>
          <th>Title</th>
          <th>Writer</th>
          <th>Create Date</th>
          <th>Updated Date</th>
          <th>Option</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="row in people">
          <td>{{row.id}}</td>
          <td>{{row.title}}</td>
          <td>{{row.writer}}</td>
          <td>{{row.date}}</td>
          <td>{{row.updateDate}}</td>
        </tr>
      </tbody>
    </table> -->
  </div>
</template>

<script>
export default {
  data () {
    return {
      people: [
          {id: 1, title: 'Bob AB', writer: 'Boogey', date: '28/07', updateDate: '09/10'},
          {id: 2, title: 'ADDD', writer: 'Adam', date: '30/07'},
          {id: 3, title: 'XSACC', writer: 'Helao', date: '28/07'}
      ]
    }
  }
}
</script>

<style lang="css">
</style>
