import { Ref } from './ref.model';

export class Ret {
  id: number;
  jurisdictionId: string; // Assuming jurisdiction is referenced by its prefix
  returnName: string;
  version: number;
  regId: number;
  formOrder: number;
  compBatchRun: Date;
  compOutputTable: string;
  transmitBatchRun: Date;
  outputRecord: string;
  period: Date;
  activateDate: Date;
  deactivateDate: Date;
  intervalType: number;
  intervalFrequency: number;
  exclHolidays: boolean;
  exclWeekends: boolean;
  required: boolean;
  adjTab: string;
  valTab: string;
  xValTab: string;
  name: string;
  stbDataGroup: string;
  newFormBatchRun: boolean;
  newFormOutputTable: string;
  keepNullNumeric: boolean;
  decisionDll: string;
  regTransModelId: string;
  onlyDataProcess: string;
  regRepInterval: string;
  templateName: string;
  templateAlias: string;
  workSheetPage: string;
  numericScaleDecimals: number;
  rounding: string; // Changed to string
  refs: number[]; // Assuming refs are referenced by their IDs

  constructor(init?: Partial<Ret>) {
    Object.assign(this, init);
  }
}