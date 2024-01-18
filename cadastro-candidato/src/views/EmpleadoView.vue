<template>
    <div class="column is-9">
        <empleado-list />
    </div>
</template>

<script>

import EmpleadoList from '@/components/EmpleadoList.vue';
export default {
  components: { EmpleadoList },
    setup () {
        

        return {}
    }
}
</script>

<style lang="scss" scoped>

</style>