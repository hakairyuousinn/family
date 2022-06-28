<template>
  <div class="button-component">
    <button @click="onClick">{{ label }}</button>
  </div>
</template>

<script setup lang="ts">
import { defineProps } from 'vue';

defineProps({
  label: {
    type: String,
    default: "label"
  },
  onClick: {
    type: Function,
    default: () => {
      console.log("button default")
    }
  }
})

</script>

<style scoped>
.button-component {
  margin: 0.3rem;
}
</style>
