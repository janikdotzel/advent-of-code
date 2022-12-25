package day03

object day03 extends App {

  val input = "WwcsbsWwspmFTGVV\nRHtMDHdSMnDBGMSDvnvDjtmpTpjTFggpmjmTFggTjmpP\nvtCSGRMBDzHddvBHBzRhrlcZhlLzWNlqblhzcr\nshhszHNHHZWqSzVNdClMjlFjBBbNTB\ntQQGmnrMnJnGfmvrRRPCjlbljFBdjFCjTjnP\nmRwtfGrMmJtwRDvQJQrJpMLSzVDHzhzHZqZzqSzcWVWH\nWsWWgrtgsrhTQtsFcWPcRMCCTvqvMvqNNqMMHlMq\nbBJrBGbzzLJznJrbSDGGJLqmlvqMqvlmLHRqRZZRNZ\nbzJfDGVSzVrJGwjVGPPpQthdPsPpjdphsc\npJpCCBSWlczWWBWMHdMmMsFmpddrgF\nwfVqZZGVQvzsMqmMgHjm\nvDZGvPttQTVtGDQDDDGwbSCcSJSCJWTcRRSRczRJ\nHLVHsVWLwbWswbpWFWrrmThfTPNnhNSDDNhDfznTnhnS\npBRcvGvvBtpGcqqQvgcphPfzfDGhzdzPDzDDhnhS\nZQRvqBptjJgZCtJqqMMMLHWwMWZWHHFFHm\nPvPFPvLLLSvNFvQNWNPvrPLrZjwhMttTwtTtQZBwqjqtZqwM\nHJDDbHjgppzCDCmzpgzsGbCsTMZqZllqhJBhMTtVBBhMtMth\nzgGncmGGzHCnHDpDgDCGsmFLLPFjPRRWLRjdcjrcdRLd\nzHnWzntnBRWTSBzRBddpFvZVcHpLFvjvLppvHP\nMmmWmNGQhbCpZVLLbccvpj\nQDMCGrNWfwNznBJsJzDBdg\ntcRcZccZmdZJctRcjrlhNNDfrdNdSfNsNT\nQHQpBVvMpRMwgBgvnHRFlhrSsgNFThgTFFflNS\nvvHpVBBBGBppHvpLvHGbjmmtCqWLJJZRzZZZZb\nZBtTDZRWsTsDZVWVZDmjpbLbpSSzmLpWrbrS\nMFNNFvvwFHwlhmNrCStLNtjzrb\nvwffwcHwflGqGflHJfDBBZtQVBgZQJtBBsnT\npTJcmMJTspmpMZZJJZHCQQMzPBlQdWWWFzWP\nLDnwrdnDnqjfqgvfDjrfFlBBPFHFSHPQCBvQSSWB\nnLbjgLjdbrwVRcppsscJVRRR\nmHnfggmMtpHPPBCs\nPJjlQQRrJhJNPPTtBsCbCCTlpptd\nrSSDhNQwShRRjhmMPmzMDfPmfLzL\nHzLFBgrCthtFrrhFSCCCvBQNRVmJJJmnpnddmppddVtJ\nMPZsjDWPjZsVzNTzpVdRdZ\nqMfjWfwclsPsjwzqHgLFhwGFwHrFFrSC\nllllmSbhNmSbNzlPmRNCcgLLchHHpTGsCTQGpT\ndVjBrvBBVLJQsLpC\nfrZBWBDMFndStFsSwzlPlq\nvmTVVtmJHwCwDllttTsrcPcMrfqPMMpjMq\nLQGBRgGGRNgGgBhgzHfpjPqsMjpLcLjrPLpq\nBdgzgSRGBnNHJtJlVStVmt\nFbDQsFjPVHFZFSbrVjSVvMJlGBJhDcqBBllJGccJnh\nRfTCTTpmppfgwCpwpLwRMnMGMlcPGqhddPcJnl\nzgLPLNCCpLggzmTzTWmVrjVvrNvjjjvbVHQZZH\nRBjjpwmRszBdvhLdSvpVpV\nGrbfbJWmQJGWrGZZQMbSLggfCgSHhCSgShghSC\nDWNDZQcrbWQrZJZGQQZPsztzBsPmBTzwcwRwjT\nrlvgglvZqbrbWbWWdvdmPHBBNMNJGqjGRRnHnPBJ\ncDFDcfcCDhLzsCfLDVpGPRJMPsRJMPNRnjHHGJ\nDCfMVDFVScVMVQlgmZgdmWQQmS\nnWTWWgwNgGDdBZBVcvDzzJccVlCzHD\nRLppMMLpRqfMtMjtMCHJFSpzHSvSpczJdl\nRdLRbQRjsRMrMRRMfbQLqPjbmnQgQWWwZmggnNTgnnWwhBhn\nTmzjMjrmjmjBmHLvGPpbvWGqJzJJ\nCfScwNDssDVCccdNVcNDQfbqJLqSLPpJpJJvJPpGTWJb\nnddCQTfQVVrHmjMnrMFM\nWHDnTwvwcwZmWwQTnBtgbVLLbgfSlTfrfb\nCPPGdJRzNhNpzPJtMgBLbgtlLLfLMz\nGJptpdFRhJwDmFHDjvnD\nPNcWDNnNDcLjDDcSRWtQFfzzzQgPgsssZtPZ\nMGhJRJGGrlpVGVHVCqqGqBQvzFzFfBvZvvtZtvFzvZvQ\nJmJplCrlMNdmjbNbWR\npqpqFJPPSswJshNghg\nzTHHrrbLzDQHccfhqmDshgCwfmqm\nrtqqtTTHtzGLPWBdnGBSWGSS\ngmNvgVqjjqzfMRgrRtPcft\nWswSQwWWHGCsHQhlGGLLJRbLMRfRGcMb\ndQCRCWhhwCwFwQshhRTmmBmFjFTTVNpqTnTj\nFZvqSWqjjZvvrNSvbblcbslDppDHbcsS\nMmwLTwPmBwmLJJmLlWzWnDllHcHzcDHM\nQRwtQtLTwwQBTPfFfZdFvqqrFGWjrh\nMqlnnNvJJZnNNdJZZLvLJnMzjjCTCChgWjccWqcjhcgcWR\ntbddSHDBbHgHhHTCjh\nmffBfbpsFSdQQDbQsrlJvwJNLLJMrrlsJr\nRjqbNRRbDDqHndbcHDqdRHcChsffCQJJssZGpzpCpJphJd\nVrMmSbrWVMtMtLmQGCfZWJZCfpZfJW\nPgSPgTvSSHjjBbvbvq\nwhclNQQfcCFCcrJRjmmHNWsmLs\nPPzMbqBPLVtnTppPTPzHJrGWJRRvsjjjRHssRb\nPtgPVZTtTLMtBzqPqttPVMClcdDcgCCfCQDSdSgCwlhh\nDrcrsvcNtLWSFPSFszbM\nHqTdHJdQhGJBHQHWWDTnnPzbMMzPnS\nhdwfqdhQJfjlccrfvNDLfl\nBBPCWvjvTLrHTHHPCTndfwhbdnnZZfDhJwfJVb\nmsmgNMMcgmgczlmmgQNlddpVDDZpZpDfhZfJwsJF\nmmQmMgSgzmqSRllGmgjPHrvvwHttjLrLRWWB\nRwvDvhjhMvwlFNwNwCWCCWWLZcbGGZLGJVrppbZVcjmpmJ\ntfnfsStnPPfTfgnPSSzPflJZZZrlZJVzLLmZJrzVmG\nnPHqgfsHQnffqgSTldHTPnPHWMRFFqqFhNNNCwNCFMMhDMhh\nFmwFHmnlGJfnlSlmrfsSvWgZNWNvLvtqLqDJhWJD\nBVVTTMqRWvRZRbhW\npMBPCzVPQcQsGqSFmPFwSF\nTcpTpwqZqMpZqlZCpZlwDjjcPNdgdPjHHHdvhHQgvv\nzQFBRbmsQbLLBnGBvFdPghddNgHjNSSj\nQnszWVzLfsLGbnGQbwpVtMrwZTqpCqpppr\nWrZmrJcGwZdGZZmHdJcwGWcZsdFFLqTtLVtSTLtvvLtLLqSs\nfnpCCQClfpQlzbbpQpflBpjhLVSTvFhjqtstVsjtstFVMs\nQBQRnbCRpnPngnbggCzzRClZwJHFHDwZJPJGWHwmNGHPZr\nfDhjvftQtDwgPhdRcRRP\nbbNSgllVNMCWVnbWmcdFdmmFdpFpRrPPPw\nNBzBglNzBvvGZDJQ\nrGbbtStjSdbGtDpjjJbbRRbdrcCsCCrFqhllrFHsFsCvqCWH\nTzgMMgmTVgzzTMLLfMHvTFsFCqHTvFsTvshF\ngLMPBgQmQmNzVZLPzPppjbRhhddGBGSttbpR\nzMJTpMzpVczHbCzVJVFCpJPngnBqVZqsRZZPnjqRgmjR\nwttwNdfLQwLhwhhDDhWvgRmnPqsQqjnBPSZRgjPS\nDdLwGGvNvhlvrrMFlFTcZrpC\nllBQWMScQlSSBjMrvrrPpFHFBDFDFJTmTtFFmF\nnzZzfVgzCNtnJppDHPnPpp\nLdRNfVdzbzCCjcvllMcsbtjj\npWFwpFhprTnFfWwZrsBDmsqBvZvjjv\nVbcHCthtzQtNqBsvsZvQmQsj\ncltzzVcJSMtRWdhJLhRwdh\nlmmmLRdZnjBlGgVhNSVvRMWN\nbDwCqCGPbwpPwDPPpCpqpPbScvMSMSDWgVcSShNNVfgWWv\nbTpzqJHPFFJqbTHswLlGlBntGnjQtGBZTT\npVjVlDDhmRPlHlHPWzWVWrVrcWztVdzv\nGCqGGGJSFbnLJLLfrLfPrLdgrrgfWd\nPbJSQGSsGnbMbqSFGBMMbsGTNwpTRwppDRsjwlNpsmHwDl\nGcnPbbbLqDPDBPPDlQ\nJtTChNfRpNJMTCfMTlJVsdVHvDddHBVmQm\nTzlffWNfjTfjjCjfTtRrLgbnbbnSSwbnLzZZzr\nhggWzjLhzhLhjzVWgpCpTFFHtCJFTJTHHHdG\nlvSBvNNSNSSmlbwmMJCGtJQCHmdT\ncfSlSSlvBDBPnlPPDZLsgtggZZVVfhzRgV\ngGVJGvVVZZLvQLWQppccpctpNptMhnhSjjnM\nfzQBsBzmwPzdQrRbSFNFnsSDchjnFhMN\nbCwQRbbCJvlGCHgL\nNMgdHVSqgQcVHmlllLDjlCLdjL\nwhTRJtJTnthWBlLLLmlFtVmV\nwRhnGTpzzTRnVbzzWWbJwbhNQrZHfpNgMQpfZQHHNZZHHQ\nqNNlMdbNrlVsQQfswQNCmW\nLJzBvSdLSHpDJzzzHJnHnzFQCCmmswmfwBGhsQfWfCwW\nHzSvHppDDRvgHzzcnqTrTtllZdRrbRVVZZ\nTWVVVFVPpjVFtRfPBmmzMMPCvmLm\nhDDrwndQQbbhZDMSMvcflMLmfnBL\ngrdggqsbrhdJJJrhbwbbsZGHVNHtTWpVBFVTTTVTHtNg\ntLbvnTCzCVnzzwVTJVlwltMFvQFQRFFrQPBFdNgrMBNF\npShsqqmGjZfZccsqSfbdNBMMRQGBPgMdPMPF\nHhspDpjhSjbcSmcqhZDcZZjTttLVwlTJJVWtnWVlWHCltL\nDwQBvwBnBrSVRrZM\nJWWGRssgRsFgzsFPJrNHVMHrlVrPSMNjHH\ngspgFzRCFWLJpgqqRWgqpCJwnQCnhQvwcTdcdddnwbDfhf\nfMMCwFDGNNMTdTDLlVlZZmdZBdBtVr\njjpjtbpRcPvSPnPnpPnvPPPnbZlmrWmLWHmHBWHlrmrmlZWl\njqjjnPqngtQfGFftFq\nqnzhhbzzqGgsqGtnwcJrlCMlCjvcCCcrCRrvCv\nmVSNZdTQdVVWmVFHQrpCjpjDRvjMRjdLRt\nWBHZTHHTFWWNNBNHQTZPsPggghfgsnsgsffthszJ\nsDwpdMgvHrZgwbdggzZZgPhFNFFcjPPqhLhjMlPqLq\nJffJfnJGtBtCQQRBJZTQJJGfcNjqCLcFhFWCPLjhFLPjcPhl\nVZZVmtGQQZmHrwgddppb\nNNNlpjbVpGglNbvpTwBQQvfWvfBrWvBW\nJthDJsLhhHPcGcqPshJsshSBwCWwfWSLCfSfSSRBrfWB\ndhDtZqGmctZDtZHqDGVgVgNbbbFjndMFNlFg\njqDVzzDMdDwsVQLCZVCRWLGBQC\nbbHFbSSpFbFHJHStJNbtJprZlCGLQsLGZRBLRQLQpLBClZ\nSmFmTPJvFTNbmmsMdqqjscwz\nRqMbHGJRJpgJgGgQjgrLTrTzjcrTrrLg\nlwfwdhnflPlbCsVVjhCSbV\nfwnNtwmlFZpbFZtM\nQNSQrLTNrLNQRRrfHFrSjqhblWtSltqlWqtWWl\nDvgBgnzgcvVZMljv\nDGJdjBPDngDnDjBpBmFpTRmRFLRRmmCmHH\ndtgSdTqdlvdJJvFqTvSqJqqRMPBtLHPBnWbsbWbsbWtWtWHV\nDjfCfmcpNrwZQCmmNrDZNZNpsHLHWBBbHVVcGGGbHGBbMVMB\nfpNjCfzLNZjTllvzdSgFgJ\nnHBfZmHTRwsZffjBnHfmRZHtLtdNPPlWvddWLWJlJldCldLC\nzwrbphMMVFzMwdCWNPlCbPdDCD\nhccMSpqShMSrhZTBwmTqHjqZmf\nNJGGLwGsTSsNlJZhmtgCVlbWQWlQMtCbvb\npDjppDBRdjzqpHqDSDzjVMCCrCrWtgQWdtdQQCdb\nfHpfRBPRzDpBFSqcSBRBSNhPNwwNNswJLhmmLNGJZL\nRZbsPgnVDzTJcdGjDGmD\nNwfQHQtpfppQhjVVjqVNJJTN\ntLLtwSptVCSWpvVtRnrbWbMgFPMsgZss\nVsQjSwwVSwsZzsvdscZvfrhPRpqBrBrbpzMrrTMh\nJtNDTmtGJTmLCGFDCHtDhMMBRhqqRbPrfrbNRrbR\nGDWLlDnFgZdTSTWv\ngfQHRRpQgRqNSBtjqwjztzjtnL\nFvsPgvDlFcmvmTLlBMVztnLwWLzL\ncvZGDcvbPcmbTbrcDDPgvbTJdJfJHRhZSRSpRRfHdSpSZd\nFGHHHWvBWrHHrWVZJvVtcSrtrTcrtcjMTjStSM\nswpwfRhRmmmRQDzcJlcqMSMMqtbMTz\ndQDRDDRQfmmQDNsLfwRJvZJWFWVnPWvvPddBnC\nzVhHvhMVTnMJgcTzMcfGJtfBWRtBRqJWtqJb\nhlZjZSQCZtfBbGjqbb\nSQDNwplrDVnhDcVHgT\nHHZmttZVLVMQQJwMfcDRfDbbMN\nphWvTgBqqgBWsTPTzhWzhzfNGNNwfqfcDwJRRbNcJcbl\nFnTsvnhppTPFTBpPzPvpBBpFVmtfCjfmjtCmFdStLmtdfjSd\nhMTPPMNlLZNSGNbRBB\ngjmrsrttsCnsCsttVsjvttvtZGFHdbZGWWWdZSWddBHHnSWH\nBmvptjsrfjBgsvvfgmfQchMpMqqhcQPMMPMhLQ\ndJHGnrJJpGpDpFzzDmfsfSSCbfTfMbbRDb\nvLcwtWNgtVtSNWmTmTMCmhNhTRfM\njqVgqVvWwwLwwgqZgjVSrPGzHHHqFnrHnFGHJGdr\nQcQcdgbzwJnzfgVnVwdHQbdBrrpplHvmhLjrlTphppLrjl\nMsPssfSZMWGWqWssSNPqrmmLBvjhqTvhjBprhB\nGRDDZMFNMGFCSNWFPDMMFWNnwVtdVdQfcgtddwQwzRJfQd\npMqCMBGpMMCnwnpBMGBlbVRFJFWsJzRdzHlWzzJdJsJd\njLLZjDgPbNPZTDbvftvZgzRFsRzRrRRHWFsJsFJc\nTZZLDPjtmDmbqQGwQnVM\nRjnNhBnnNNmJmBNhrqGpsHbHtstgTtTjqb\nWVMfWwQTzWZDMtlsfldqpplstf\nWVTWSTzwQWSSvQVZCQPTSZPvBcnmcvnrhmNcRFncNLRLJmnB\nlffQcnNTQBBcwqsdcqjSspcWtD\nMPMGrHGMMTqWTtDg\nVGRGLrJHZzLHPzTNTmmBfZQFTNBQ\nlQBPPrBrlnqBgSRhgZZZrLJr\nVNcWMDZbJHhWfWff\nVwvMwMvdwvdwjcwdwDDqsqsZQqPPzqzldPQtps\nVVJcZJVrRSdcsddfsvvbvFZBnngBMzMZFD\nhLLqLpqqWWphWjhlGlCHDFgzbvFBbgBFtnQpnngg\nHlhlmmHBTqTHHmlLqjTGhHhPdwdmsdcSNSfNJRrRcfwVJdrr\nHmhvmRzzHHrRMBJBjNJGDJRnJD\ncbqcPqLWZwsgQWZwWPwWgPPbntJnrNftNNNBtNJJNDBNqdjB\nlgwWgggQcWSzrlTHMHlp\nFZhQpClCWLBlrNDZvrwrrNSH\nztTfjMjJjgsGrqvzDGwG\nbMjfnjndjnJtfgMTwPjFhQhCLdQCFWQQLWQhch\nPtrqPrrMCPChzCtLFRbtNgbdTjbF\nGdZGvJSWWDGplFjbjLjLSTlL\nvspvnZsVppBdBnBpDCszhzMsMzzPzPhcPC\nPdCtdfCMfGmtfmtBSWrMQwSlwWwJNQ\nqTqbcjqHTZTbcDqczTjjZvWrQvVWJQSVQZZSVVrJNr\nqbqjRFTcHTcDFgcczRqFrPsGGGgnhtGssCdnffGmsP\nvVbcMvqjjjmHCBCBBmBSSH\nPzzLTrcrwQgfLGrJBHSGFSCHtRFBJt\ncfsPrLDwQNgsrTNTQgLwVpWnVWvMNvqjjqvpMvlj\njbqZNjLbZQvcfhhQ\nCWdCDWWMCgmJDnJmdQVzMSchvfcQVFShzf\nWPgWGRWRHdPBsttrHvNtrl\nMCJCCMCqcCqJsnssjQRlTvQQQQqTvqfQ\nHGVmwmLVlZRzcGZG\nFcchHmDFpFbDMDMbntsJ\nvfNvvttvDRcrvRNRNTLDNRcVsFhwVBVTwbbFFVbVhbJMBB\nCJGgSJHdgPPSnQnjnddHGGFMSMwMMsmsFMMFhFShMWMM\ndGCdjgzHCPPGlHDDqJtqRcqJlpfR\nCwtqqvwLwnwhtRLtdRnwnnRhPHpLLppTPPpTVfTHzJWVLTWB\nsGDsZDllDrMFZVmGgsmDMlmHpJBHpcJFPPTHfJJPzfTHWz\nsrgVlGSgZVGGrRvwQwdqwtCvnS\nMLPgDrgLzThhCTgg\nGVfCbvVbVvhBHlmhvhHv\nZqRQffRwtNZWVZfZSMsSssncnDCDnL\nVwBNhNNmhJswqjJsRzPgDvSgJvtgvgDt\nrRMblbHFfRrSWvPPPgMzLW\nZFpFpCcprGfbrGfGCHclZfnGqmsjmBdNVjQqRBnqBsVNQwBh\nVLQlZWQbcPgcPmWbgmDWLQzdpGMTTqdpMTNsbGsNpMSqdq\nHChrwfffhJtfHwJTsDqThhDMpTGsjj\nHvffCrtBzclQZvQD\ndCBVJJmrJDlBdQJWZTTsWbdWThWpbM\nFHjSPjwqwssSgqTMGbGWhTMHMMZG\nFwLvLfLjjSPqFqgzwffFSvrlDJvrQrDVrnmBvrJsQm\nhZCRbddrgrRSVgcGZjjLFGLZFQFp\nnzPvMsPvtmvPNssPMqpcWVjGGcGLlqGcGN\nTBzmTmzmVmrBSBRrRgdR\nbwZZmwfFmcfCRswNWNBsjC\nVDSdglSStRCCTNCD\nVVVppGHGlrQnnGJbMmnmCh\nnFhgnFVNtgtFVssgdgVtVtsqJPTNJvDSNqTZZzbzTDDzDq\nHqLHqcwlBjLzPvPJCCvJ\nHGrlHqlllHBppRrlwWFnnWfFFVhMnnWdFhfn\nFsMFVszjggMMzWlPJlPPlLQsJv\nnqnBSNlfZqSvLHnHvWLQTW\nhShpfCCSRtfjgFjMzdjlpr\njsbDsQnnwPsFbZgSltWGdgJgpnSp\nSCVvLhLRrzCNBhrCvddMJpWdWGvJGlgtpv\ncHLBBVCcCNHrbcSQFwQTbDws\nrMlbLgrRgpwTDbflcnHtSScwHdJdwHJB\nCQCjjZPzGGzCzZQvBVBNdQNSJVcJ\njsPhCzhPqFZzZzChFlsbRRLrMfTbbcLTpD\ndqjzmmmQBjBHCmWrgVGWrrrvrpgVpM\nPLJnTFbJnhTDzrGgMlvrFMzF\nSssPcDttntDSsLcCzHBmmwcmZQqH\nfFfFSPHllPRpRfnmmFfHvHjgbsBQjsptBdBTTddjsDdt\nZqLJCLCZzzTgWjdzDjzb\nZhNLMrNcGrchLqcCVMqRvlSnFnRnmmGRggnPnP\nHMCMCMrHfwMHtFwTtgHHbVjjbsRZDwDVRbZqjhBD\ncDpmpdpNLNDcdZjZqZBNBqssRR\nSLJSdPcznSvdvDcHFCftFTFWCTHnWt\nNlMmlPClmdGldRZHJs\ntgJJcJQcntHBsnBt\nTfSgQhhccczSVQqrgSgTjFWqLWmwLFNJLWWPPwqM\nGGwTHqWVdnTTVVqgngzzqHzGFbJspFccRsjDpDcjsRFDsdjR\nrtLflllZSrhQPLBtQStZvhjDNjbcDNDRNFjCsCDCFs\nmPLBQPtvtQZtBlLSmMqVGwHbVMqTHWmz\nVvJCrqTvPvQrCpRNVRFGfZfmfG\nHMzsdWsjhZSsJJZNZf\nwHlbjnlzWCvqJBQlrD\nFnVRRsVdSnSnFSRqTVdqBBDBhrDdmcddMcMQMhzm\nHtZvJwHlgjlGlHJLNjJrMmrcmDQfDLczDrMhhh\nvGGpJjttvlZljZllZvJZvwGqsSTRWSCpnCWTVPVmWWTWWn\nwSHCNwwmcSMLSDFcwwSSHQvZnQjLZffZjZZbVZjVVb\nJqsNJJGGqprJNtpWhGhspfnffTnTvZvVbZnTrfBQvV\nGsWhdGtPWpghJRqhtNPmClczSlDglHMlczmwCH\nTzRpjVRjFpVLTTdgrTgrGsZwrZZwgg\nvQfSBdbDbMbQNBJrlhmGnrgrgwZhvm\nSHSCbdbddcVWqqFPCLqR"

  case class Rucksack(itemList: String) {
    val (compartment1, compartment2) = itemList.splitAt(itemList.length / 2)

    private def findDuplicateItem(): Char = {
      var duplicate: Char = ' '
      for (item <- compartment1) {
        if (compartment2.contains(item)) {
          duplicate = item
        }
      }
      duplicate
    }
    val duplicateItem = findDuplicateItem()

    val priority = convertToPriority(duplicateItem)
  }

  val itemLists: List[String] = input.split("\n").toList
  val rucksacks: List[Rucksack] = itemLists.map(x => Rucksack(x))

  def convertToPriority(char: Char): Int = {
    char match {
      case 'a' => 1
      case 'b' => 2
      case 'c' => 3
      case 'd' => 4
      case 'e' => 5
      case 'f' => 6
      case 'g' => 7
      case 'h' => 8
      case 'i' => 9
      case 'j' => 10
      case 'k' => 11
      case 'l' => 12
      case 'm' => 13
      case 'n' => 14
      case 'o' => 15
      case 'p' => 16
      case 'q' => 17
      case 'r' => 18
      case 's' => 19
      case 't' => 20
      case 'u' => 21
      case 'v' => 22
      case 'w' => 23
      case 'x' => 24
      case 'y' => 25
      case 'z' => 26
      case 'A' => 27
      case 'B' => 28
      case 'C' => 29
      case 'D' => 30
      case 'E' => 31
      case 'F' => 32
      case 'G' => 33
      case 'H' => 34
      case 'I' => 35
      case 'J' => 36
      case 'K' => 37
      case 'L' => 38
      case 'M' => 39
      case 'N' => 40
      case 'O' => 41
      case 'P' => 42
      case 'Q' => 43
      case 'R' => 44
      case 'S' => 45
      case 'T' => 46
      case 'U' => 47
      case 'V' => 48
      case 'W' => 49
      case 'X' => 50
      case 'Y' => 51
      case 'Z' => 52
    }
  }

  val sumPart1 = rucksacks.map(r => r.priority).sum
  println(sumPart1)

  val groupedRucksacks: List[List[Rucksack]] = rucksacks.grouped(3).toList

  def findBadge(rucksacks: List[Rucksack]): Option[Char] = {
    var badge: Option[Char] = None
    for (item <- rucksacks.head.itemList) {
      if (rucksacks(1).itemList.contains(item) && rucksacks(2).itemList.contains(item)) {
        badge = Some(item)
      }
    }
    badge
  }

  val badges: List[Char] = groupedRucksacks.map(group => findBadge(group).get)
  val sumPart2 = badges.map(b => convertToPriority(b)).sum
  println(sumPart2)

}


