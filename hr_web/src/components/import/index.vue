<template>
  <div class="uploadBox clearfix">
    <el-upload
      class="upload-demo upload-text"
      :action="baseData.upUrl"
      :headers="myheader"
      :before-upload="beforeUpload"
      :on-error="uploadFail"
      :on-success="handleFileSuccess"
      :show-file-list="false"
      :file-list="fileList"
      >
      <el-button size="small" type="primary" :disabled="processing">{{uploadTip}}</el-button>
      <div slot="tip" class="el-upload__tip">
        (Suggest<span class="colRed pointer"><a :href="baseData.fileUrl">Download template</a></span>Upload after filling)<br>
        <span @click="handleUpload" class="colRed pointer">Click to view file requirements</span>
      </div>
    </el-upload>
    <el-upload
      class="upload-demo"
      drag
      :action="baseData.upUrl"
      :headers="myheader"
      :before-upload="beforeUpload"
      :on-error="uploadFail"
      :on-success="handleFileSuccess"
      :show-file-list="false"
      :file-list="fileList">
      <i class="el-icon-upload"></i>
      <div class="el-upload__text">Drag file here</div>
    </el-upload>
    <el-dialog
    title="文件上传要求"
    :visible.sync="centerDialogVisible"
    width="30%"
    center>
      <div class="upInfoTip">
        <p><strong>Important Thing</strong></p>
        <p>Support WPS, excel2003 or later version</p>
      </div>
    </el-dialog>
  </div>
</template>
<script>
import { importFile } from '@/filters/index'
import { getToken } from '@/utils/auth'
export default {
  name: 'import',
  props: ['baseData'],
  data() {
    return {
      resume: '',
      centerDialogVisible: false,
      fileList: [],
      processing: false,
      uploadTip: 'Upload',
      importFlag: 1,
      errorResults: [],
      positiveList: []
    }
  },
  computed: {
    myheader: function() {
      return {
        Authorization: `Bearer ${getToken()}`
      }
    }
  },
  methods: {
    // 业务方法
    // 下载模板
    download() {
      this.$emit('handleExport')
    },
    // 文件上传完成
    typeTip(obj) {
      this.$message.error(obj)
    },
    beforeUpload(file, obj) {
      importFile(file, obj, this.typeTip)
    },
    // 上传错误
    uploadFail(err, file, fileList) {
      this.uploadTip = 'Upload'
      this.processing = false
      this.$message.error(err)
    },
    // 上传成功
    handleFileSuccess(obj, file, fileList) {
      this.uploadTip = 'Upload'
      this.processing = false
      this.dialogImportVisible = false
      if (obj.code === 0) {
        this.$message.success('Success' + '!')
      } else {
        this.$message.error('Error' + '!')
      }
    },
    // 查看上传文件要求
    handleUpload: function() {
      this.centerDialogVisible = true
    }
  }
}
</script>
<style>
.upInfoTip {
  line-height: 30px;
}
.upload-text {
  margin: 50px 0 0;
}
</style>
