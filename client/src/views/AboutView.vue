<template>
  <div class="about">
    <h1>This is an Test Page</h1>
    <test-components></test-components>
    <button-component></button-component>
    <button-component label="parent label"></button-component>
    <button-component label="parent method" @click="onClick"></button-component>
  </div>
</template>

<script setup lang="ts">
import TestComponents from '@/components/TestComponents.vue';
import ButtonComponent from '@/components/ButtonComponent.vue';

function onClick () {
  console.log("parent method")
}
</script>
