export class Ref {
  id: number;
  item: string;
  tabName: string;
  altFldName: string;
  fieldPos: number;
  reference: string;
  type: string; // Changed to string
  sortPos: number;
  boeItem: string;
  calcField: boolean;
  cellDesc: string;
  doNotExport: boolean;
  reportLine: string;
  cumulative: boolean;
  scheduleCode: string;
  retId: number; // Assuming ret is referenced by its ID

  constructor(init?: Partial<Ref>) {
    Object.assign(this, init);
  }
}