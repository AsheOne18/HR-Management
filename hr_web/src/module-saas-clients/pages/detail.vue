<template>
  <div class="dashboard-container">
    <div class="app-container">
      <el-card shadow="never">
            <el-tabs v-model="activeName">
              <el-tab-pane label="Company Info" name="first">
                <el-form ref="form" :model="formData" label-width="200px">
                  <el-form-item label="Company Name">
                    <el-input v-model="formData.name" style="width:250px" disabled></el-input>
                  </el-form-item>
                  <el-form-item label="Company Address">
                    <el-input v-model="formData.companyAddress" style="width:250px" disabled></el-input>
                  </el-form-item>
                  <el-form-item label="Company Phone">
                    <el-input v-model="formData.companyPhone" style="width:250px" disabled></el-input>
                  </el-form-item>
                  <el-form-item label="Company Email">
                    <el-input v-model="formData.mailbox" style="width:250px" disabled></el-input>
                  </el-form-item>
                  <el-form-item label="Remark">
                    <el-input v-model="formData.remark"></el-input>
                  </el-form-item>
                  
                  <el-form-item>
                    <el-button type="primary">Create</el-button>
                    <el-button>Cancel</el-button>
                  </el-form-item>
                </el-form>
              </el-tab-pane>
              <el-tab-pane label="Accouunt Info" name="second">Account Info</el-tab-pane>
              <el-tab-pane label="Trade Info" name="third">Trade Info</el-tab-pane>
            </el-tabs>
      </el-card>
     </div>
  </div>
</template>

<script>
import {detail} from '@/api/base/sassClients'
export default {
  name: 'saas-clients-table-detail',
  data() {
    return {
      activeName: 'first',
      formData:{}
    }
  },
  methods: {
    detail(id){
      detail({id:id}).then(res => {
        this.formData = res.data.data
        console.log(id);
        console.log(this.formData);
      })
    }
  },
  created() {
    var id = this.$route.params.id;
    this.detail(id);
  },
}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
.alert {
  margin: 10px 0px 0px 0px;
}
.pagination {
  margin-top: 10px;
  text-align: right;
}
</style>
