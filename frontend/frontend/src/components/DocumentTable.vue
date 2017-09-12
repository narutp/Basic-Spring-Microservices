<template lang="html">
  <div document-table--container>
    <hr>
    <section>
      <b-table
          :data="tableData"
          :paginated="isPaginated"
          :per-page="5"
          default-sort="user.first_name">

          <template scope="props">
              <b-table-column field="id" label="ID" width="40" sortable numeric>
                  {{ props.row.id }}
              </b-table-column>

              <b-table-column field="user.first_name" label="First Name" sortable>
                  {{ props.row.user.first_name }}
              </b-table-column>

              <b-table-column field="user.last_name" label="Last Name" sortable>
                  {{ props.row.user.last_name }}
              </b-table-column>

              <b-table-column field="date" label="Date" sortable centered>
                  <span class="tag is-success">
                      {{ new Date(props.row.date).toLocaleDateString() }}
                  </span>
              </b-table-column>
              
              <b-table-column label="Gender">
                  <b-icon pack="fa"
                      :icon="props.row.gender === 'Male' ? 'mars' : 'venus'">
                  </b-icon>
                  {{ props.row.gender }}
              </b-table-column>
          </template>
      </b-table>
    </section>
  </div>
</template>

<script>
export default {
  data () {
    return {
      tableData: [{'id': 1, 'user': {'first_name': 'Jesse', 'last_name': 'Simmons'}, 'date': '2016-10-15 13:43:27', 'gender': 'Male'},
      {'id': 2, 'user': {'first_name': 'John', 'last_name': 'Jacobs'}, 'date': '2016-12-15 06:00:53', 'gender': 'Male'},
      {'id': 3, 'user': {'first_name': 'John', 'last_name': 'Jacobs'}, 'date': '2016-12-15 06:00:53', 'gender': 'Male'},
      {'id': 4, 'user': {'first_name': 'John', 'last_name': 'Jacobs'}, 'date': '2016-12-15 06:00:53', 'gender': 'Male'},
      {'id': 5, 'user': {'first_name': 'John', 'last_name': 'Jacobs'}, 'date': '2016-12-15 06:00:53', 'gender': 'Male'},
      {'id': 6, 'user': {'first_name': 'John', 'last_name': 'Jacobs'}, 'date': '2016-12-15 06:00:53', 'gender': 'Male'}],
      isPaginated: true,
      isPaginationSimple: false,
      defaultSortDirection: 'asc',
      perPage: 5
    }
  }
}
</script>

<style lang="css">
</style>
