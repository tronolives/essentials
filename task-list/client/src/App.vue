<template>
    <div>
        <AppHeader></AppHeader>
        <MainPageLayout></MainPageLayout>
        <AppFooter></AppFooter>
    </div>
</template>

<script>
import MainPageLayout from '@/layouts/MainPageLayout.vue'
import AppHeader from '@/components/SharedComponents/AppHeader.vue'
import AppFooter from '@/components/SharedComponents/AppFooter.vue'

export default {
    components: {
        MainPageLayout,
        AppHeader,
        AppFooter
    }
}
</script>
