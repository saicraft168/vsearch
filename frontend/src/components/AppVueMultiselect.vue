<template>
  <div>
    <VueMultiselect
      v-model="selected"
      :options="options">
    </VueMultiselect>
  </div>
</template>

<script>
export default {
  data () {
    return {
      selected: null,
      options: ['list', 'of', 'options']
    }
  }
}
</script>